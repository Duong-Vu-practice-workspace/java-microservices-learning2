package vn.edu.ptit.duongvct.practice1.socialmedia.post_service.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "posts")
public class Post {
    @Id
    private String postId;
    private String title;
    // private String id
    private List<String> topics;
    private int upvotes;
    private int downvotes;
    private String body;
}
