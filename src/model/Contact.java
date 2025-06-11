package model;

public class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact-> name: " + name + ", phone: " + phone + ".";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode()); // genera un codigo diferente para un objeto que crea
        result = prime * result + ((phone == null) ? 0 : phone.hashCode()); 
        return result;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj == null) return false;
       if(this == obj) return true;
       if(obj== null || getClass() != obj.getClass()){
        return false;
       }

       //aqui obj y this son clase contacto

       Contact c = (Contact) obj; //castea
       return name != null && name.equals(c.getName());




    }

    
    
}
