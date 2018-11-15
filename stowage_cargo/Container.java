package stowage_cargo;

public class Container {

    private ContainerType type;

    private int id;

    private ContainerCategory category;

    private ContainerProfile profile;

    private String barCodeIDCategory;

    private String qrCodeIDCategory;

    private int maximumNumberOfBaggages;

    // Konstruktor
    //  type ->
    //  id ->
    //  category ->
    //  profile ->
    //  barStuff ->
    //  qrStuff ->
    //  maxBaggages
    Container(ContainerType type, int id, ContainerCategory category, ContainerProfile profile, String barStuff, String qrStuff, int maxBaggages) {
        this.type = type;
        this.id = id;
        this.category = category;
        this.profile = profile;
        this.barCodeIDCategory = barStuff;
        this.qrCodeIDCategory = qrStuff;
        this.maximumNumberOfBaggages = maxBaggages;
    }

}
