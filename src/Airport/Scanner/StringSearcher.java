package Airport.Scanner;

public class StringSearcher {
    StringSearchAlgorithm stringSearchAlgorithm;
    private int[] failure;

    public StringSearcher(StringSearchAlgorithm stringSearchAlgorithm) {
        this.stringSearchAlgorithm = stringSearchAlgorithm;
    }

    public boolean search(String text, String pattern) {
        char[] textArray = text.toCharArray();
        char[] patternArray = pattern.toCharArray();

        if (stringSearchAlgorithm.equals(StringSearchAlgorithm.BITAP)) {
            return bitap(textArray, patternArray);
        } else if (stringSearchAlgorithm.equals(StringSearchAlgorithm.BOYERMOORE)) {
            return boyermoore(textArray, patternArray);
        } else if (stringSearchAlgorithm.equals(StringSearchAlgorithm.KNUTHMORRISPRATT)) {
            return knuthmorrispratt(textArray, patternArray);
        } else if(stringSearchAlgorithm.equals(StringSearchAlgorithm.JAVASTRINGCONTAINS)) {
            return text.contains(pattern);
        }
        return false;
    }

    private boolean bitap(char[] text, char[] pattern) {
        int m = pattern.length;
        long pattern_mask[] = new long[Character.MAX_VALUE + 1];
        long R = ~1;
        if (m == 0)
            return false;
        if (m > 63) {
            System.out.println("Pattern is too long!");
            return false;
        }
        for (int i = 0; i <= Character.MAX_VALUE; ++i)
            pattern_mask[i] = ~0;
        for (int i = 0; i < m; ++i)
            pattern_mask[pattern[i]] &= ~(1L << i);
        for (int i = 0; i < text.length; ++i) {
            R |= pattern_mask[text[i]];
            R <<= 1;
            if ((R & (1L << m)) == 0)
                return true;
        }
        return false;
    }

    private boolean boyermoore(char[] text, char[] pattern) {
        if (pattern.length == 0) {
            return false;
        }
        int charTable[] = makeCharTable(pattern);
        int offsetTable[] = makeOffsetTable(pattern);
        for (int i = pattern.length - 1, j; i < text.length; ) {
            for (j = pattern.length - 1; pattern[j] == text[i]; --i, --j) {
                if (j == 0) {
                    return true;
                }
            }
            i += Math.max(offsetTable[pattern.length - 1 - j], charTable[text[i]]);
        }
        return false;
    }

    private boolean knuthmorrispratt(char[] text, char[] pattern) {
        failure = new int[pattern.length];
        fail(pattern.toString());
        int pos = posMatch(text.toString(), pattern.toString());
        if (pos == -1) {
            return false;
        } else {
            return true;
        }
    }


    private int[] makeCharTable(char[] pattern) {
        final int ALPHABET_SIZE = 256;
        int[] table = new int[ALPHABET_SIZE];
        for (int i = 0; i < table.length; ++i) {
            table[i] = pattern.length;
        }
        for (int i = 0; i < pattern.length - 1; ++i) {
            table[pattern[i]] = pattern.length - 1 - i;
        }
        return table;
    }

    private int[] makeOffsetTable(char[] pattern) {
        int[] table = new int[pattern.length];
        int lastPrefixPosition = pattern.length;
        for (int i = pattern.length - 1; i >= 0; --i) {
            if (isPrefix(pattern, i + 1)) {
                lastPrefixPosition = i + 1;
            }
            table[pattern.length - 1 - i] = lastPrefixPosition - i + pattern.length - 1;
        }
        for (int i = 0; i < pattern.length - 1; ++i) {
            int slen = suffixLength(pattern, i);
            table[slen] = pattern.length - 1 - i + slen;
        }
        return table;
    }

    private static boolean isPrefix(char[] pattern, int p) {
        for (int i = p, j = 0; i < pattern.length; ++i, ++j) {
            if (pattern[i] != pattern[j]) {
                return false;
            }
        }
        return true;
    }

    private static int suffixLength(char[] pattern, int p) {
        int len = 0;
        for (int i = p, j = pattern.length - 1; i >= 0 && pattern[i] == pattern[j]; --i, --j) {
            len += 1;
        }
        return len;
    }

    private void fail(String pat) {
        int n = pat.length();
        failure[0] = -1;
        for (int j = 1; j < n; j++) {
            int i = failure[j - 1];
            while ((pat.charAt(j) != pat.charAt(i + 1)) && i >= 0) {
                i = failure[i];
            }
            if (pat.charAt(j) == pat.charAt(i + 1)) {
                failure[j] = i + 1;
            } else {
                failure[j] = -1;
            }
        }
    }

    private int posMatch(String text, String pat) {
        int i = 0, j = 0;
        int lens = text.length();
        int lenp = pat.length();
        while (i < lens && j < lenp) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            } else if (j == 0) {
                i++;
            } else {
                j = failure[j - 1] + 1;
            }
        }
        return ((j == lenp) ? (i - lenp) : -1);
    }
}
