//package rc;
//
//import java.awt.PageAttributes.MediaType;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//@RestController
//public class DepartmentController {
//
//    public DepartmentRepository dpr;
//    public DepartmentController( DepartmentRepository dpr) {
//        this.dpr=dpr;
//    }
//    @RequestMapping(value="/departments/all" ,method=RequestMethod.GET)
//    public List<Department> getall(){
//        List<Department> g=this.dpr.findAll();
//        return g;
//
//    }
//    @RequestMapping(value="/departments" ,method=RequestMethod.PUT)
//    public void insetnew(@RequestBody Department dept){
//        this.dpr.insert(dept);
//    }
//    @RequestMapping(value="/departments" ,method=RequestMethod.POST)
//    public void update(@RequestBody Department dept){
//        this.dpr.save(dept);
//    }
//
//    @RequestMapping(value="/departments/{id}" ,method=RequestMethod.DELETE)
//    public void deleteone(@PathVariable String id) {
//        this.dpr.delete(id);
//    }
//
//    //To upload file
//
//    @RequestMapping(value="/departments/add" ,method=RequestMethod.POST)
//    public ResponseEntity<Object>uploadFile(@RequestParam("file")MultipartFile file) throws IOException {
//        File convertFile=new File("C:\\Users\\home\\IdeaProjects\\java practic ds\\src\\readme.txt"+file.getOriginalFilename());
//        convertFile.createNewFile();
//        FileOutputStream fout= new FileOutputStream(convertFile);
//        fout.write(file.getBytes());
//        fout.close();
//        return new ResponseEntity<>("FIle is uploaded successfully",HttpStatus.OK);
//    }
//
//
//}
