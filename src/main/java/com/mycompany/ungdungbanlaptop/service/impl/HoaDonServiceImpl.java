/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ungdungbanlaptop.service.impl;

import com.mycompany.ungdungbanlaptop.entity.HoaDon;
import com.mycompany.ungdungbanlaptop.model.viewModel.HoaDonBanHangViewModel;
import com.mycompany.ungdungbanlaptop.repository.HoaDonRepository;
import com.mycompany.ungdungbanlaptop.repository.impl.HoaDonRepositoryImpl;
import com.mycompany.ungdungbanlaptop.service.HoaDonService;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author thang
 */
public class HoaDonServiceImpl implements HoaDonService{

    private HoaDonRepository hoadonRepository = new HoaDonRepositoryImpl();
    
    @Override
    public HoaDon add(HoaDon hoaDon) {
       return hoadonRepository.add(hoaDon);
    }

    @Override
    public List<HoaDon> getAll() {
        return hoadonRepository.getAll();
    }

    @Override
    public HoaDon update(HoaDon hoaDon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HoaDon delete(HoaDon hoaDon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HoaDon getOne(String maSp) {
        return  hoadonRepository.getOne(maSp);
    }

    @Override
    public boolean setTrangThai(UUID id, HoaDon hoaDon) {
        return hoadonRepository.setTrangThai(id, hoaDon);
    }

    @Override
    public List<HoaDonBanHangViewModel> getHoaDonBanHang() {
        return hoadonRepository.getHoaDonBanHang();
    }

    @Override
    public List<HoaDonBanHangViewModel> getTrangThai(int trangThai) {
        return hoadonRepository.getTrangThai(trangThai);
    }

    @Override
    public List<HoaDonBanHangViewModel> getHoaDonCho() {
        return hoadonRepository.getHoaDonCho();
    }
    
}