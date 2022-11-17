/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ungdungbanlaptop.service.impl;

import com.mycompany.ungdungbanlaptop.entity.NhanVien;
import com.mycompany.ungdungbanlaptop.repository.NhanVienRepository;
import com.mycompany.ungdungbanlaptop.service.NhanVienService;
import java.util.List;

/**
 *
 * @author vinhnv
 */
public class NhanVienServiceImpl implements NhanVienService {

    private NhanVienRepository nhanVienRepository = new NhanVienRepository();

    @Override
    public String addNhanVien(NhanVien nv) {
        // Muốn check gì thì check ở đây
        NhanVien add = nhanVienRepository.addNhanVien(nv);
        if (add == null) {
            return " Add thất bại";
        }
        return "Add thành công ";
    }

    ;

    @Override
    public String updateNhanVien(NhanVien nv) {
        // Muốn check gì thì check ở đây
        NhanVien add = nhanVienRepository.update(nv);
        if (add == null) {
            return " Sửa thất bại";
        }else{
            
        return "Sửa thành công ";
        }
    }

    @Override
    public String deleteNhanVien(NhanVien nv) {
         // Muốn check gì thì check ở đây
        NhanVien add = nhanVienRepository.delete(nv);
        if (add == null) {
            return " Xóa thất bại";
        }
        return "Xóa thành công ";
    }

    @Override
    public NhanVien getNhanVienByEmail(String email) {
        return nhanVienRepository.getNhanVienByEmail(email);
    }

    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepository.getAll();
    }

    @Override
    public List<NhanVien> search(List<NhanVien> list, String hoTen, String email, String soDienThoai) {
        return nhanVienRepository.search(hoTen, email, soDienThoai);
    }

    

}
