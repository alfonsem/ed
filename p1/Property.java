package propertyshop;

/**
 *
 * @author Alfonso Esteve
 */
public class Property {

    String name, address, owner, ownerAddress;
    double surface, availableSurface;
    int price;

    /**
     * Método para pasarle el nombre
     *
     * @param name
     */
    public void setName(String name) {
        try{
            this.name=name.toLowerCase();
        }catch(Exception e){
            this.name = null;
        }
    }

    /**
     * Método que devuelve el nombre
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Método para pasarle la dirección
     *
     * @param address
     */
    public void setAddress(String address) {
        try{
            this.address = address.toUpperCase();
        }catch(Exception e){
            this.address = null;
        }
    }

    /**
     * Método que devuelve la dirección
     *
     * @return adress
     */
    public String getAddress() {
        return address;
    }

    /**
     * Método para pasarle los metros construidos
     *
     * @param surface
     */
    public void setConstructedSurface(double surface) {
        //Actualizamos los metros sólo si son mayor que cero
        if (surface > 0) {
            this.surface = surface;
        }
    }

    /**
     * Método que devuelve los metros construídos
     *
     * @return surface
     */
    public double getConstructedSurface() {
        return surface;
    }

    /**
     * Método para pasarle los metros útiles
     *
     * @param availableSurface
     */
    public void setAvailableSurface(double availableSurface) {
        //Actualizamos los metros útiles sólo si son mayor que cero
        if (availableSurface > 0) {
            this.availableSurface = availableSurface;
        }
    }

    /**
     * Método que devuelve los metros útiles
     *
     * @return availableSurface
     */
    public double getAvailableSurface() {
        return availableSurface;
    }

    /**
     * Método para pasarle el nombre del propietario
     *
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Método que devuelve el nombre del propietario
     *
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Método para pasarle la dirección del`propietario
     *
     * @param ownerAddress
     */
    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    /**
     * Método que devuelve la dirección del propietario
     *
     * @return ownerAddress
     */
    public String getOwnerAddress() {
        return ownerAddress;
    }

    /**
     * Método para pasarle el precio
     *
     * @param price
     */
    public void setPrice(int price) {
        //Actualizamos el precio sólo si es mayor que cero
        if (price > 0) {
            this.price = price;
        }
    }

    /**
     * Método que devuelve el precio
     *
     * @return price
     */
    public int getPrice() {
        return price;
    }
}
