package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class po_return_mapping implements Serializable {
    private String poId;

    private String salesFieldName;

    private String loginname;

    private String branchCode;

    private String branchName;

    private String storeNo;

    private String storeName;

    private String supplierCode;

    private String supplierName;

    private String poNo;

    private Date poStartDate;

    private Date poEndDate;

    private String shipTo;

    private String version;

    private String companyCode;

    private String voucherCurrency;

    private String soldTo;

    private String loadType;

    private BigDecimal totalAmount;

    private String saleVoucherType;

    private String productGroup;

    private String salesOrg;

    private String transportType;

    private String factoryCode;

    private Date sapTime;

    private String sapStatus;

    private String closeReason;

    private String orderStore;

    private String poDetailId;

    private String line;

    private String materialCode;

    private String materielDesc;

    private BigDecimal saleTotal;

    private String saleUnit;

    private BigDecimal price;

    private String itemCode;

    private String itemName;

    private BigDecimal amount;

    private String remark;

    private String saleUnitName;

    private String batchNumber;

    private static final long serialVersionUID = 1L;

    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId == null ? null : poId.trim();
    }

    public String getSalesFieldName() {
        return salesFieldName;
    }

    public void setSalesFieldName(String salesFieldName) {
        this.salesFieldName = salesFieldName == null ? null : salesFieldName.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode == null ? null : branchCode.trim();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo == null ? null : storeNo.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo == null ? null : poNo.trim();
    }

    public Date getPoStartDate() {
        return poStartDate;
    }

    public void setPoStartDate(Date poStartDate) {
        this.poStartDate = poStartDate;
    }

    public Date getPoEndDate() {
        return poEndDate;
    }

    public void setPoEndDate(Date poEndDate) {
        this.poEndDate = poEndDate;
    }

    public String getShipTo() {
        return shipTo;
    }

    public void setShipTo(String shipTo) {
        this.shipTo = shipTo == null ? null : shipTo.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getVoucherCurrency() {
        return voucherCurrency;
    }

    public void setVoucherCurrency(String voucherCurrency) {
        this.voucherCurrency = voucherCurrency == null ? null : voucherCurrency.trim();
    }

    public String getSoldTo() {
        return soldTo;
    }

    public void setSoldTo(String soldTo) {
        this.soldTo = soldTo == null ? null : soldTo.trim();
    }

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType == null ? null : loadType.trim();
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSaleVoucherType() {
        return saleVoucherType;
    }

    public void setSaleVoucherType(String saleVoucherType) {
        this.saleVoucherType = saleVoucherType == null ? null : saleVoucherType.trim();
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup == null ? null : productGroup.trim();
    }

    public String getSalesOrg() {
        return salesOrg;
    }

    public void setSalesOrg(String salesOrg) {
        this.salesOrg = salesOrg == null ? null : salesOrg.trim();
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType == null ? null : transportType.trim();
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode == null ? null : factoryCode.trim();
    }

    public Date getSapTime() {
        return sapTime;
    }

    public void setSapTime(Date sapTime) {
        this.sapTime = sapTime;
    }

    public String getSapStatus() {
        return sapStatus;
    }

    public void setSapStatus(String sapStatus) {
        this.sapStatus = sapStatus == null ? null : sapStatus.trim();
    }

    public String getCloseReason() {
        return closeReason;
    }

    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason == null ? null : closeReason.trim();
    }

    public String getOrderStore() {
        return orderStore;
    }

    public void setOrderStore(String orderStore) {
        this.orderStore = orderStore == null ? null : orderStore.trim();
    }

    public String getPoDetailId() {
        return poDetailId;
    }

    public void setPoDetailId(String poDetailId) {
        this.poDetailId = poDetailId == null ? null : poDetailId.trim();
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line == null ? null : line.trim();
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
    }

    public String getMaterielDesc() {
        return materielDesc;
    }

    public void setMaterielDesc(String materielDesc) {
        this.materielDesc = materielDesc == null ? null : materielDesc.trim();
    }

    public BigDecimal getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(BigDecimal saleTotal) {
        this.saleTotal = saleTotal;
    }

    public String getSaleUnit() {
        return saleUnit;
    }

    public void setSaleUnit(String saleUnit) {
        this.saleUnit = saleUnit == null ? null : saleUnit.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSaleUnitName() {
        return saleUnitName;
    }

    public void setSaleUnitName(String saleUnitName) {
        this.saleUnitName = saleUnitName == null ? null : saleUnitName.trim();
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
    }
}