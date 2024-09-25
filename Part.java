public class Part{
    
    //class is basically a datatype, i.e the blueprint for the object, also template for the object
    // object is the isntance of the class.
    // two ways of declaring the properties.
    // instance variable
    // methods.
    // instance variable and the methods are called memebers of the class.
    
    /*constructors - 
        this is a special kind of method of the class, having no return type and is non static, has access modifier.
        this accepts arguments, unlike class.
        the name of the constructor is same as the name of the class.
    */
    
    // empty constructor
    Part(){
        
    }
    
    //Parameterized constructor
    Part(String name,int size,String supplier,int cost){
        
        this.name = name;
        this.size = size;
        this.supplier = supplier;
        this.cost = cost;
        
    }

    Part(String name,String size2,String supplier,int cost){
        
        this.name = name;
        this.size2 = size2;
        this.supplier = supplier;
        this.cost = cost;
        
    }
    
    String name;
    int size; // this is initialized...
    String supplier;
    int cost;
    String size2;
    
    public void intro(){
        if(size != 0){
            System.out.println("Name : " + name + ", Size : " + size + ", supplier : " + supplier + ", cost : " + cost);
        }else{
            System.out.println("Name : " + name + ", Size : " + size2 + ", supplier : " + supplier + ", cost : " + cost);
        }
    }
    
    protected void finalize( ){
    // finalization code here
    // executed only once right before the object is send to garbage collection. 
    }
    
    
    public static void main(String args[]){
        //data-type variableName = literal;
        int var1 = 1000;
        
        Part obj;  // i have a variable name obj, and it is of type Part.
        
        obj = new Part();   // new keyword allocated memory location to the object. obj variable is storing the memory location of the object created here with the new keyword.
        
        // obj.
        // int arr[] = {1,2,3,4,5};
        // System.out.println(arr);
        
        obj.name = "Nut";
        obj.size = 10;
        obj.supplier = "Mitsubishi";
        obj.cost = 100;
        
        obj.intro();
        
        
        Part spring;  // i have a variable name obj, and it is of type Part.
        
        spring = new Part("spring",10,"Hyundai", 10);   // new keyword allocated memory location to the object. obj variable is storing the memory location of the object created here with the new keyword.
        
        // obj.
        // int arr[] = {1,2,3,4,5};
        // System.out.println(arr);
        
        spring.intro();
        
        Part tyre = new Part("Type-MRF", "17/18-11P", "MRF", 2000);
        
        tyre = null;
        
        tyre.intro();
       
    }
 
}

/* Animals = class
ground Animals
water animals 
flying animals

*/