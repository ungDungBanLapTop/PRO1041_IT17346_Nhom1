/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ungdungbanlaptop.service;

import com.mycompany.ungdungbanlaptop.entity.ChatLieu;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoàng Ngô
 */
public interface ChatLieuService {

    public List<ChatLieu> getAll();

    public Boolean addNew(ChatLieu chatLieu);
}
