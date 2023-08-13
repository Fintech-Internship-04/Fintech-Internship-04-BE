package com.example.moneytransfer.group;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class GroupController {


    //그룹 생성

    //그룹에 인원 추가


    //모임 멤버 삭제

    //인원 조정

    //모임 이름 편집
    @PutMapping("/change_group/{name}")
    public boolean ChangeGroupName(@PathVariable String name){




        //db에 접근해서 이름 변경하는 코드

        //return true -> 이름 변경 성공 시
        //return false -> 이름 변경 실패 시
        return true;
    }
}
