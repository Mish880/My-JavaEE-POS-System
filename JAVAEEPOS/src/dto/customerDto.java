package dto;

public class customerDto {
     private String nic;
     private String name;
     private String address;
     private String contact;

    public customerDto() {
    }

    public customerDto(String nic, String name, String address, String contact) {
        this.setNic(nic);
        this.setName(name);
        this.setAddress(address);
        this.setContact(contact);
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
