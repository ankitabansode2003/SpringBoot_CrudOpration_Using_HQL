package com.spring.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entity.Teacher;

@Repository
public class TeacherDAO {
	
	@Autowired
	SessionFactory sf;
	
	
	public String InsertData(Teacher t) {
		Session session =sf.openSession();
		Transaction transaction=session.beginTransaction();
		String hql="insert into Teacher (t_id,t_name,t_department,t_salary)values(:t_id,:t_name,:t_department,:t_salary)";
		Query<Teacher> query=session.createQuery(hql);
		query.setParameter("t_id", t.getT_id());
		query.setParameter("t_name", t.getT_name());
		query.setParameter("t_department", t.getT_department());
		query.setParameter("t_salary", t.getT_salary());
		query.executeUpdate();
		transaction.commit();
		session.close();
		return "data inserted successfully";
		
	}
	
	public String updateData(Teacher t,int t_id) {
		Session session=sf.openSession();
		Transaction transaction =session.beginTransaction();
		String hql="update Teacher set t_id=:t_id,t_name=:t_name,t_department=:t_department,t_salary=:t_salary where t_id=:t_id";
		Query<Teacher> query=session.createQuery(hql);
		query.setParameter("t_id",t.getT_id());
		query.setParameter("t_name",t.getT_name());
		query.setParameter("t_department", t.getT_department());
		query.setParameter("t_salary",t.getT_salary());
		query.executeUpdate();
		transaction.commit();
		session.close();
		return "data updated successfully";	
	}
	
	public String DeleteData( int t_id) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		String hql="delete from Teacher where t_id=:t_id";
		Query<Teacher> query=session.createQuery(hql);
		query.setParameter("t_id", t_id);
		query.executeUpdate();
		transaction.commit();
		session.close();
		return "data deleted successfully";
		}
	
	public Teacher GetSingleData(int t_id) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		String hql="from Teacher where t_id=:t_id";
		Query<Teacher> query=session.createQuery(hql);
		query.setParameter("t_id",t_id);
		Teacher t=query.getSingleResult();
		transaction.commit();
		session.close();
		return t;
	}
	
	public List<Teacher> GetAllData() {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		String hql="from Teacher";
		Query<Teacher> query=session.createQuery(hql);
		List<Teacher> list=query.getResultList();
		transaction.commit();
		session.close();
		return list;
	}
}