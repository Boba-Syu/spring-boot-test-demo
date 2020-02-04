package cn.bobasyu.controller;

import cn.bobasyu.entity.TbUser;
import cn.bobasyu.service.ITbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RESTful的Controller
 *
 * @author Boba
 */
@RestController
public class TbUserController {
    private ITbUserService tbUserService;

    @Autowired
    public TbUserController(ITbUserService tbUserService) {
        this.tbUserService = tbUserService;
    }

    @GetMapping("/tbuser")
    public List<TbUser> selectById(TbUser tbUser) {
        return tbUserService.select(tbUser);
    }

    @PostMapping("/tbuser")
    public int insert(TbUser tbUser) {
        return tbUserService.insert(tbUser);
    }

    @PutMapping("/tbuser")
    public int update(TbUser tbUser) {
        return tbUserService.update(tbUser);
    }

    @DeleteMapping("/tbuser")
    public int delete(Integer uid) {
        return tbUserService.delete(uid);
    }
}
