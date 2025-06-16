public class person {

    protected String id;
    protected String name;
    protected String status;
    protected String birthDate;
    protected String contact;

    public person(){
        id = "";
        name = "";
        status = "";
        birthDate = "";
        contact = "";
    }

    public person(String id, String name, String status, String birthDate, String contact) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.birthDate = birthDate;
        this.contact = contact;
    }

    public void printInfo()
    {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("status:"+status);
        System.out.println("birthDate:"+birthDate);
        System.out.println("contact:"+contact);
    }

}
