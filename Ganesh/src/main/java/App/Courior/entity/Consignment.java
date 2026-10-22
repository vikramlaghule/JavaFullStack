package App.Courior.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Consignment {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(unique = true) public Long lrNo;
	  public String bookDate, bookTime, createdBy;
	  public String fromName, fromPhone, fromGst, fromLine1, fromCity, fromState, fromPin;
	  public String toName, toPhone, toGst, toLine1, toCity, toState, toPin;
	  public String goods, eway, inv, pay, deliv;
	  public int art;
	  public double wt, cw, val, fr, ham, dd, oth, gstp, gst, tot;
	  public Long getLrNo() {
		  return lrNo;
	  }
	  public void setLrNo(Long lrNo) {
		  this.lrNo = lrNo;
	  }
	  public String getBookDate() {
		  return bookDate;
	  }
	  public void setBookDate(String bookDate) {
		  this.bookDate = bookDate;
	  }
	  public String getBookTime() {
		  return bookTime;
	  }
	  public void setBookTime(String bookTime) {
		  this.bookTime = bookTime;
	  }
	  public String getCreatedBy() {
		  return createdBy;
	  }
	  public void setCreatedBy(String createdBy) {
		  this.createdBy = createdBy;
	  }
	  public String getFromName() {
		  return fromName;
	  }
	  public void setFromName(String fromName) {
		  this.fromName = fromName;
	  }
	  public String getFromPhone() {
		  return fromPhone;
	  }
	  public void setFromPhone(String fromPhone) {
		  this.fromPhone = fromPhone;
	  }
	  public String getFromGst() {
		  return fromGst;
	  }
	  public void setFromGst(String fromGst) {
		  this.fromGst = fromGst;
	  }
	  public String getFromLine1() {
		  return fromLine1;
	  }
	  public void setFromLine1(String fromLine1) {
		  this.fromLine1 = fromLine1;
	  }
	  public String getFromCity() {
		  return fromCity;
	  }
	  public void setFromCity(String fromCity) {
		  this.fromCity = fromCity;
	  }
	  public String getFromState() {
		  return fromState;
	  }
	  public void setFromState(String fromState) {
		  this.fromState = fromState;
	  }
	  public String getFromPin() {
		  return fromPin;
	  }
	  public void setFromPin(String fromPin) {
		  this.fromPin = fromPin;
	  }
	  public String getToName() {
		  return toName;
	  }
	  public void setToName(String toName) {
		  this.toName = toName;
	  }
	  public String getToPhone() {
		  return toPhone;
	  }
	  public void setToPhone(String toPhone) {
		  this.toPhone = toPhone;
	  }
	  public String getToGst() {
		  return toGst;
	  }
	  public void setToGst(String toGst) {
		  this.toGst = toGst;
	  }
	  public String getToLine1() {
		  return toLine1;
	  }
	  public void setToLine1(String toLine1) {
		  this.toLine1 = toLine1;
	  }
	  public String getToCity() {
		  return toCity;
	  }
	  public void setToCity(String toCity) {
		  this.toCity = toCity;
	  }
	  public String getToState() {
		  return toState;
	  }
	  public void setToState(String toState) {
		  this.toState = toState;
	  }
	  public String getToPin() {
		  return toPin;
	  }
	  public void setToPin(String toPin) {
		  this.toPin = toPin;
	  }
	  public String getGoods() {
		  return goods;
	  }
	  public void setGoods(String goods) {
		  this.goods = goods;
	  }
	  public String getEway() {
		  return eway;
	  }
	  public void setEway(String eway) {
		  this.eway = eway;
	  }
	  public String getInv() {
		  return inv;
	  }
	  public void setInv(String inv) {
		  this.inv = inv;
	  }
	  public String getPay() {
		  return pay;
	  }
	  public void setPay(String pay) {
		  this.pay = pay;
	  }
	  public String getDeliv() {
		  return deliv;
	  }
	  public void setDeliv(String deliv) {
		  this.deliv = deliv;
	  }
	  public int getArt() {
		  return art;
	  }
	  public void setArt(int art) {
		  this.art = art;
	  }
	  public double getWt() {
		  return wt;
	  }
	  public void setWt(double wt) {
		  this.wt = wt;
	  }
	  public double getCw() {
		  return cw;
	  }
	  public void setCw(double cw) {
		  this.cw = cw;
	  }
	  public double getVal() {
		  return val;
	  }
	  public void setVal(double val) {
		  this.val = val;
	  }
	  public double getFr() {
		  return fr;
	  }
	  public void setFr(double fr) {
		  this.fr = fr;
	  }
	  public double getHam() {
		  return ham;
	  }
	  public void setHam(double ham) {
		  this.ham = ham;
	  }
	  public double getDd() {
		  return dd;
	  }
	  public void setDd(double dd) {
		  this.dd = dd;
	  }
	  public double getOth() {
		  return oth;
	  }
	  public void setOth(double oth) {
		  this.oth = oth;
	  }
	  public double getGstp() {
		  return gstp;
	  }
	  public void setGstp(double gstp) {
		  this.gstp = gstp;
	  }
	  public double getGst() {
		  return gst;
	  }
	  public void setGst(double gst) {
		  this.gst = gst;
	  }
	  public double getTot() {
		  return tot;
	  }
	  public void setTot(double tot) {
		  this.tot = tot;
	  } 
	  
	  
	  
	
	
}
