package springboot;
//Run the code to view
public class Annotations {
    public static void main(String[] args) {
        System.out.println("\n" +
                "The @Repository annotation is a marker for  any class that fulfills the role or stereotype \n(also known as Data Access Object or DAO) of a repository.\n" +
                "they access the database directly\n" +
                "@Repository=\t{@Component + DAOs (Data Access Objects)}\n" +
                "Code:\n" +
                "import org.springframework.data.mongodb.repository.MongoRepository;\n" +
                "public interface DemoRepository  extends MongoRepository<Demo,String>{\n" +
                "\n" +
                "}\n" +
                "\n" +
                "@Controller= {@Component + dispatching, forwarding, calling service methods etc.}\n" +
                "Code:\n" +
                "@RestController\n" +
                "@RequestMapping(\"/schools\")\n" +
                "public class SchoolController {\n" +
                "\tprivate SchoolRepository schoolrepo;\n" +
                "\t\n" +
                "\tpublic SchoolController(SchoolRepository schoolrepo) {\n" +
                "\t\tthis.schoolrepo=schoolrepo;\n" +
                "\t}\n" +
                "\t\n" +
                "\t@GetMapping(\"/all\")\n" +
                "\tpublic List<School> getAll(){\n" +
                "\tList<School> schoolall =\tthis.schoolrepo.findAll();\n" +
                "\t\treturn schoolall;\n" +
                "\t}\n" +
                "\t\n" +
                "\t@GetMapping(\"/{id}\")\n" +
                "\tpublic School getById(@PathVariable String id) {\n" +
                "\tSchool  schoolbyid=  this.schoolrepo.findById(id);\n" +
                "\treturn schoolbyid;\n" +
                "\t}\n" +
                "\t\n" +
                "\t@PutMapping()\n" +
                "\tpublic void insert(@RequestBody School school) {\n" +
                "\t\tthis.schoolrepo.insert(school);\n" +
                "\t\t\n" +
                "\t}\n" +
                "\t@PostMapping()\n" +
                "\tpublic void update(@RequestBody School school) {\n" +
                "\t\tthis.schoolrepo.save(school);\t\n" +
                "\t}\n" +
                "\t@DeleteMapping(\"/{id}\")\n" +
                "\tpublic void deleteSchool(@PathVariable(\"id\") String id) {\n" +
                "\t\tthis.schoolrepo.delete(id);\n" +
                "\t}\n" +
                "\n" +
                "@PathVariable This annotation indicates that a method parameter should be bound to a URI template variable [the one in '{}'].\n" +
                "\n" +
                "@Service ={@Component+ Hold business Logic, Calculations etc.}\n" +
                "Data related calculations and all.This annotation of business layer in which our user not directly call persistence method \n so it will call this methods using this annotation.\n It will request @Repository as per user request");
    }

}
