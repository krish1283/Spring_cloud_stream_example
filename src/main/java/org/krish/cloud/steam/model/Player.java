package org.krish.cloud.steam.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    String name;
    String id;
    int matchPlayed;

    Ratings ratings;
    String country;

}
