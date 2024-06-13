package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultToleranceConfigInfo;
import com.vmware.vim25.ManagedByInfo;
import com.vmware.vim25.VAppProductInfo;
import com.vmware.vim25.VirtualMachineConfigSummary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineConfigSummary", propOrder = {"name", "template", "vmPathName", "memorySizeMB", "cpuReservation", "memoryReservation", "numCpu", "numEthernetCards", "numVirtualDisks", "uuid", "instanceUuid", "guestId", "guestFullName", "annotation", "product", "installBootRequired", "ftInfo", "managedBy", "tpmPresent", "numVmiopBackings", "hwVersion"})
public class VirtualMachineConfigSummary extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  protected boolean template;
  
  @XmlElement(required = true)
  protected String vmPathName;
  
  protected Integer memorySizeMB;
  
  protected Integer cpuReservation;
  
  protected Integer memoryReservation;
  
  protected Integer numCpu;
  
  protected Integer numEthernetCards;
  
  protected Integer numVirtualDisks;
  
  protected String uuid;
  
  protected String instanceUuid;
  
  protected String guestId;
  
  protected String guestFullName;
  
  protected String annotation;
  
  protected VAppProductInfo product;
  
  protected Boolean installBootRequired;
  
  protected FaultToleranceConfigInfo ftInfo;
  
  protected ManagedByInfo managedBy;
  
  protected Boolean tpmPresent;
  
  protected Integer numVmiopBackings;
  
  protected String hwVersion;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public boolean isTemplate() {
    return this.template;
  }
  
  public void setTemplate(boolean paramBoolean) {
    this.template = paramBoolean;
  }
  
  public String getVmPathName() {
    return this.vmPathName;
  }
  
  public void setVmPathName(String paramString) {
    this.vmPathName = paramString;
  }
  
  public Integer getMemorySizeMB() {
    return this.memorySizeMB;
  }
  
  public void setMemorySizeMB(Integer paramInteger) {
    this.memorySizeMB = paramInteger;
  }
  
  public Integer getCpuReservation() {
    return this.cpuReservation;
  }
  
  public void setCpuReservation(Integer paramInteger) {
    this.cpuReservation = paramInteger;
  }
  
  public Integer getMemoryReservation() {
    return this.memoryReservation;
  }
  
  public void setMemoryReservation(Integer paramInteger) {
    this.memoryReservation = paramInteger;
  }
  
  public Integer getNumCpu() {
    return this.numCpu;
  }
  
  public void setNumCpu(Integer paramInteger) {
    this.numCpu = paramInteger;
  }
  
  public Integer getNumEthernetCards() {
    return this.numEthernetCards;
  }
  
  public void setNumEthernetCards(Integer paramInteger) {
    this.numEthernetCards = paramInteger;
  }
  
  public Integer getNumVirtualDisks() {
    return this.numVirtualDisks;
  }
  
  public void setNumVirtualDisks(Integer paramInteger) {
    this.numVirtualDisks = paramInteger;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public String getInstanceUuid() {
    return this.instanceUuid;
  }
  
  public void setInstanceUuid(String paramString) {
    this.instanceUuid = paramString;
  }
  
  public String getGuestId() {
    return this.guestId;
  }
  
  public void setGuestId(String paramString) {
    this.guestId = paramString;
  }
  
  public String getGuestFullName() {
    return this.guestFullName;
  }
  
  public void setGuestFullName(String paramString) {
    this.guestFullName = paramString;
  }
  
  public String getAnnotation() {
    return this.annotation;
  }
  
  public void setAnnotation(String paramString) {
    this.annotation = paramString;
  }
  
  public VAppProductInfo getProduct() {
    return this.product;
  }
  
  public void setProduct(VAppProductInfo paramVAppProductInfo) {
    this.product = paramVAppProductInfo;
  }
  
  public Boolean isInstallBootRequired() {
    return this.installBootRequired;
  }
  
  public void setInstallBootRequired(Boolean paramBoolean) {
    this.installBootRequired = paramBoolean;
  }
  
  public FaultToleranceConfigInfo getFtInfo() {
    return this.ftInfo;
  }
  
  public void setFtInfo(FaultToleranceConfigInfo paramFaultToleranceConfigInfo) {
    this.ftInfo = paramFaultToleranceConfigInfo;
  }
  
  public ManagedByInfo getManagedBy() {
    return this.managedBy;
  }
  
  public void setManagedBy(ManagedByInfo paramManagedByInfo) {
    this.managedBy = paramManagedByInfo;
  }
  
  public Boolean isTpmPresent() {
    return this.tpmPresent;
  }
  
  public void setTpmPresent(Boolean paramBoolean) {
    this.tpmPresent = paramBoolean;
  }
  
  public Integer getNumVmiopBackings() {
    return this.numVmiopBackings;
  }
  
  public void setNumVmiopBackings(Integer paramInteger) {
    this.numVmiopBackings = paramInteger;
  }
  
  public String getHwVersion() {
    return this.hwVersion;
  }
  
  public void setHwVersion(String paramString) {
    this.hwVersion = paramString;
  }
}
