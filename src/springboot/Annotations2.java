
//The @Repository annotation is a marker for  any class that fulfills the role or stereotype
//(also known as Data Access Object or DAO) of a repository.
//        they access the database directly
//@Repository=	{@Component + DAOs (Data Access Objects)}

//        Code:

//        import org.springframework.data.mongodb.repository.MongoRepository;
//public interface DemoRepository  extends MongoRepository<Demo,String>{
//
//}




//@Controller= {@Component + dispatching, forwarding, calling service methods etc.}
//        Code:
//@RestController
//@RequestMapping("/schools")
//public class SchoolController {
//    private SchoolRepository schoolrepo;
//
//    public SchoolController(SchoolRepository schoolrepo) {
//        this.schoolrepo = schoolrepo;
//    }
//
//    @GetMapping("/all")
//    public List<School> getAll() {
//        List<School> schoolall = this.schoolrepo.findAll();
//        return schoolall;
//    }
//
//    @GetMapping("/{id}")
//    public School getById(@PathVariable String id) {
//        School schoolbyid = this.schoolrepo.findById(id);
//        return schoolbyid;
//    }
//
//    @PutMapping()
//    public void insert(@RequestBody School school) {
//        this.schoolrepo.insert(school);
//
//    }
//
//    @PostMapping()
//    public void update(@RequestBody School school) {
//        this.schoolrepo.save(school);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteSchool(@PathVariable("id") String id) {
//        this.schoolrepo.delete(id);
//    }
//}



//    @PathVariable This annotation indicates that a method parameter should be bound to a URI template variable [the one in '{}'].



//    @Service ={@Component+ Hold business Logic, Calculations etc.}
//    Data related calculations and all.This annotation of business layer in which our user not directly call persistence method
//    so it will call this methods using this annotation.
//    It will request @Repository as per user request

public class Annotations2 {
}
