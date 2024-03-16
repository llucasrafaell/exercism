class Badge {
    
    public String print(Integer id, String name, String department) {

        if(id == null && department != null){
            return (name + " - " + department.toUpperCase());
        }
        else if (department == null && id != null){
            return (auxIdIdentidade(id) + " - " + name + " - " +"OWNER");
        }
        else if (department == null && id == null){
            return (name + " - " +"OWNER");
        }
        return (auxIdIdentidade(id) + " - " + name + " - " + department.toUpperCase());
    }

    public String auxIdIdentidade(Integer id){
        return ("["+id+"]");
    }
}
