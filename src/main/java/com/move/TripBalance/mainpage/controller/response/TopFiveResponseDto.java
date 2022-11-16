package com.move.TripBalance.mainpage.controller.response;


import lombok.*;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TopFiveResponseDto {
    private Long postId;
    private String title;
    private String img;
    private Long heartNum;
}
