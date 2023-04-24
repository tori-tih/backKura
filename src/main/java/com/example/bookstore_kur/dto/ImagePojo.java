package com.example.bookstore_kur.dto;

import com.example.bookstore_kur.entity.Image;
import com.example.bookstore_kur.entity.JointProduct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Getter
@Setter
public class ImagePojo {
    private String id;
    private String name;
    private String contentType;
    private Long size;
    private String url;

    public static ImagePojo romEntity(Image img){
        ImagePojo pojo = new ImagePojo();
        pojo.setId(img.getId());
        pojo.setName(img.getName());
        pojo.setContentType(img.getContentType());
        pojo.setSize(img.getSize());
        pojo.setUrl(ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("api/images/")
                .path(img.getId())
                .toUriString());

        return pojo;
    }

    public static Image toEntity(ImagePojo pojo) {
        Image img = new Image();
        img.setId(pojo.getId());
        img.setName(pojo.getName());
        img.setContentType(pojo.contentType);
        img.setSize(pojo.getSize());



        return img;
    }
}
