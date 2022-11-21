/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ungdungbanlaptop.service.impl;

import com.mycompany.ungdungbanlaptop.entity.SanPham;
import com.mycompany.ungdungbanlaptop.repository.SanPhamRepository;
import com.mycompany.ungdungbanlaptop.repository.impl.SanPhamRepositoryImpl;
import com.mycompany.ungdungbanlaptop.service.SanPhamService;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Diệm DZ
 */
public class SanPhamServiceImpl implements SanPhamService {

    private SanPhamRepository sanPhamRepository = new SanPhamRepositoryImpl();

    @Override
    public List<SanPham> getAll() {
        return sanPhamRepository.getAll();
    }

    @Override
    public String add(SanPham sanPham) {
        SanPham add = sanPhamRepository.add(sanPham);
        if (add != null) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(SanPham sanPham) {
        SanPham update = sanPhamRepository.update(sanPham);
        if (update != null) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String delete(SanPham sanPham) {
        SanPham delete = sanPhamRepository.delete(sanPham);
        if (delete != null) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public SanPham getOne(String ma) {
        return sanPhamRepository.getOne(ma);
    }

    @Override
    public List<SanPham> search(List<SanPham> list, String maSp) {
        return sanPhamRepository.search(maSp);
    }

    @Override
    public List<SanPham> searchByTen(List<SanPham> list, String tenSp) {
        return sanPhamRepository.searchByTen(tenSp);
    }

    @Override
    public void updateSoLuongSanPham(Map<UUID, SanPham> list) {
        sanPhamRepository.updateSoLuongSanPham(list);
    }

}
