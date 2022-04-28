package jwp.zajecia.filmy.api;
import jwp.zajecia.filmy.dao.entity.VideoCassete;
import jwp.zajecia.filmy.manager.VideoCassetteManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts")
public class VideoCasseteApi {

    private VideoCassetteManager videoCassetes;

    @Autowired
    public VideoCasseteApi(VideoCassetteManager videoCassetes) {
        this.videoCassetes = videoCassetes;
    }

    @GetMapping("/all")
    public Iterable<VideoCassete> getAll() {
        return videoCassetes.findAll();
    }

    @GetMapping
    public Optional<VideoCassete> getById(@RequestParam long index) {
        return videoCassetes.findAllById(index);
    }

    @PostMapping
    public VideoCassete addVideo(@RequestBody VideoCassete videoCassete) {
        return videoCassetes.save(videoCassete);
    }

    @PutMapping
    public VideoCassete updateVideo(@RequestBody VideoCassete videoCassete) {
        return videoCassetes.save(videoCassete);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam long index) {
        videoCassetes.delete(index);
    }
}
