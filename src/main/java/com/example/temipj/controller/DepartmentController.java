package com.example.temipj.controller;

import com.example.temipj.domain.UserDetailsImpl;
import com.example.temipj.dto.requestDto.DepartmentRequestDto;
import com.example.temipj.dto.requestDto.EmployeeRequestDto;
import com.example.temipj.dto.responseDto.EmpResponseDto;
import com.example.temipj.dto.responseDto.EmployeeResponseDto;
import com.example.temipj.dto.responseDto.ResponseDto;
import com.example.temipj.service.DepartmentService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    // 부서 생성
    @PostMapping(value = "/create/{divisionId}")
    private ResponseDto<?> create(@PathVariable String divisionId, @RequestBody DepartmentRequestDto departmentRequestDto,
                                  HttpServletRequest request) {
        return departmentService.createDepart(divisionId, departmentRequestDto, request);
    }

    // 부서 전체 조회
    @GetMapping(value = "/all")
    public ResponseDto<?> getAll(){
        return departmentService.getDepartmentAll();
    }

    // 부서 삭제
    @DeleteMapping("delete/{departmentId}")
    public ResponseDto<?>delete(@PathVariable Long departmentId,HttpServletRequest request){
        return departmentService.deleteDepart(departmentId,request);
    }

}
