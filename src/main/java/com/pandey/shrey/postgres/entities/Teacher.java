package com.pandey.shrey.postgres.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends EntityWithUUID {
    private String name;
    private String pictureURL;
    private String email;
}
