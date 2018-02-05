/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas_besar.impl;

import com.tugas_besar.entity.Member;
import com.tugas_besar.error.MemberException;
import com.tugas_besar.service.MemberDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class MemberDaoImpl implements MemberDao {

    private Connection connection;

    private final String insertMember = "INSERT INTO MEMBER"
            + "(NAMA, ALAMAT, TELEPON, EMAIL) VALUES"
            + "(?,?,?,?)";
    private final String updateMember = "UPDATE MEMBER SET NAMA=?,ALAMAT=?,TELEPON=?,EMAIL=? WHERE ID=?";

    private final String deleteMember = "DELETE FROM MEMBER WHERE ID=?";

    private final String getById = "SELECT * FROM MEMBER WHERE ID = ?";

    private final String getByEmail = "SELECT * FROM MEMBER WHERE EMAIL = ?";

    private final String selectAll = "SELECT * FROM MEMBER";

    public MemberDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertMember(Member member) throws MemberException {
        PreparedStatement statement = null;

        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertMember, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, member.getNama());
            statement.setString(2, member.getAlamat());
            statement.setString(3, member.getTelepon());
            statement.setString(4, member.getEmail());
            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                member.setId(result.getInt(1));
            }

            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new MemberException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    @Override
    public void updateMember(Member member) throws MemberException {
        PreparedStatement statement = null;

        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateMember);
            statement.setString(1, member.getNama());
            statement.setString(2, member.getAlamat());
            statement.setString(3, member.getTelepon());
            statement.setString(4, member.getEmail());
            statement.setInt(5, member.getId());
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new MemberException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    @Override
    public void deleteMember(Integer id) throws MemberException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(deleteMember);
            statement.setInt(1, id);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new MemberException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    @Override
    public Member getMember(Integer id) throws MemberException {
       PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getById);
            //indeks ke 1, isinya ID dari parameter
            statement.setInt(1, id);

            ResultSet result = statement.executeQuery();
            Member member = null;
            
            if (result.next()) {
                member = new Member();
                member.setId(result.getInt("ID"));
                member.setNama(result.getString("NAMA"));
                member.setAlamat(result.getString("ALAMAT"));
                member.setTelepon(result.getString("TELEPON"));
                member.setEmail(result.getString("EMAIL"));
            } else {
                throw new MemberException("Pelanggan dengan id "+ id + " tidak ditemukan");
            }
            connection.commit();
            return member;

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new MemberException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    @Override
    public Member getMember(String email) throws MemberException {
       PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByEmail);

            statement.setString(1, email);

            ResultSet result = statement.executeQuery();
            Member member = null;
            
            if (result.next()) {
                member = new Member();
                member.setId(result.getInt("ID"));
                member.setNama(result.getString("NAMA"));
                member.setAlamat(result.getString("ALAMAT"));
                member.setTelepon(result.getString("TELEPON"));
                member.setEmail(result.getString("EMAIL"));
            } else {
                throw new MemberException("Pelanggan dengan email " + email + " tidak ditemukan");
            }
            connection.commit();
            return member;

        }  catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new MemberException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    

    @Override
    public List<Member> selectAllMember() throws MemberException {
     Statement statement = null;
        List<Member> list = new ArrayList<Member>();
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            ResultSet result = statement.executeQuery(selectAll);
            Member member = null;
            
            while (result.next()) {
                member = new Member();
                member.setId(result.getInt("ID"));
                member.setNama(result.getString("NAMA"));
                member.setAlamat(result.getString("ALAMAT"));
                member.setTelepon(result.getString("TELEPON"));
                member.setEmail(result.getString("EMAIL"));
                list.add(member);
            }
            return list;
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new MemberException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}

