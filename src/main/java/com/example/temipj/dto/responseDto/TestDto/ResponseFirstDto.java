package com.example.temipj.dto.responseDto.TestDto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class ResponseFirstDto {
    //    {
    //        "version": "20230331",
    //            "division": []

    String version = "20230331";
    ArrayList division;
}
