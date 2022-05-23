package customer

class Customer {
    String name 
    String phoneNumber

    static constraints = {
        name(blank:false,nullable:false,unique:true)
        phoneNumber(blank:false,nullable:false,unique:true)
    }
}
