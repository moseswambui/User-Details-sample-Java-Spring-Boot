package UserDetailProject.userDetail;

public class Details {
    long id;
    String first_name;
    String second_name;
    int id_number;
    String location;

    public Details(long id,String second_name, String first_name,int id_number,String location ){
        super();
        this.id = id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.location = location;
    }

    public long getId(){
        return id;
    }

    public String getFirstName(){
        return first_name;
    }

    public String getSecondName(){
        return second_name;
    }

    public String getLocation(){
        return location;
    }
    @Override
    public String toString(){
        return String.format("Personal Details [id = %s, first_name=%s, second_name=%s, location=%s]"); 
    }
}
