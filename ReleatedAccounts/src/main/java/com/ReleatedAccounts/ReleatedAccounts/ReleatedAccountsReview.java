package com.ReleatedAccounts.ReleatedAccounts;

public class ReleatedAccountsReview {
	public String id;
	public String MSISDN; 
    public String Package;
    public String Plan;
    public String ChildMSISDN;
    public String Email;
    public String Status;
    public String BillDueAmount;
    public String Balance;
	public ReleatedAccountsReview(String id, String mSISDN, String package1, String plan, String childMSISDN,
			String email, String status, String billDueAmount, String balance) {
		super();
		this.id = id;
		MSISDN = mSISDN;
		Package = package1;
		Plan = plan;
		ChildMSISDN = childMSISDN;
		Email = email;
		Status = status;
		BillDueAmount = billDueAmount;
		Balance = balance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	public String getPackage() {
		return Package;
	}
	public void setPackage(String package1) {
		Package = package1;
	}
	public String getPlan() {
		return Plan;
	}
	public void setPlan(String plan) {
		Plan = plan;
	}
	public String getChildMSISDN() {
		return ChildMSISDN;
	}
	public void setChildMSISDN(String childMSISDN) {
		ChildMSISDN = childMSISDN;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getBillDueAmount() {
		return BillDueAmount;
	}
	public void setBillDueAmount(String billDueAmount) {
		BillDueAmount = billDueAmount;
	}
	public String getBalance() {
		return Balance;
	}
	public void setBalance(String balance) {
		Balance = balance;
	}
	
	
	
	
	

}
