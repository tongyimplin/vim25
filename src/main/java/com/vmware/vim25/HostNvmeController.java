package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNvmeController;
import com.vmware.vim25.HostNvmeNamespace;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeController", propOrder = {"key", "controllerNumber", "subnqn", "name", "associatedAdapter", "transportType", "fusedOperationSupported", "numberOfQueues", "queueSize", "attachedNamespace", "vendorId", "model", "serialNumber", "firmwareVersion"})
public class HostNvmeController extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected int controllerNumber;
  
  @XmlElement(required = true)
  protected String subnqn;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String associatedAdapter;
  
  @XmlElement(required = true)
  protected String transportType;
  
  protected boolean fusedOperationSupported;
  
  protected int numberOfQueues;
  
  protected int queueSize;
  
  protected List<HostNvmeNamespace> attachedNamespace;
  
  protected String vendorId;
  
  protected String model;
  
  protected String serialNumber;
  
  protected String firmwareVersion;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public int getControllerNumber() {
    return this.controllerNumber;
  }
  
  public void setControllerNumber(int paramInt) {
    this.controllerNumber = paramInt;
  }
  
  public String getSubnqn() {
    return this.subnqn;
  }
  
  public void setSubnqn(String paramString) {
    this.subnqn = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getAssociatedAdapter() {
    return this.associatedAdapter;
  }
  
  public void setAssociatedAdapter(String paramString) {
    this.associatedAdapter = paramString;
  }
  
  public String getTransportType() {
    return this.transportType;
  }
  
  public void setTransportType(String paramString) {
    this.transportType = paramString;
  }
  
  public boolean isFusedOperationSupported() {
    return this.fusedOperationSupported;
  }
  
  public void setFusedOperationSupported(boolean paramBoolean) {
    this.fusedOperationSupported = paramBoolean;
  }
  
  public int getNumberOfQueues() {
    return this.numberOfQueues;
  }
  
  public void setNumberOfQueues(int paramInt) {
    this.numberOfQueues = paramInt;
  }
  
  public int getQueueSize() {
    return this.queueSize;
  }
  
  public void setQueueSize(int paramInt) {
    this.queueSize = paramInt;
  }
  
  public List<HostNvmeNamespace> getAttachedNamespace() {
    if (this.attachedNamespace == null)
      this.attachedNamespace = new ArrayList<>(); 
    return this.attachedNamespace;
  }
  
  public String getVendorId() {
    return this.vendorId;
  }
  
  public void setVendorId(String paramString) {
    this.vendorId = paramString;
  }
  
  public String getModel() {
    return this.model;
  }
  
  public void setModel(String paramString) {
    this.model = paramString;
  }
  
  public String getSerialNumber() {
    return this.serialNumber;
  }
  
  public void setSerialNumber(String paramString) {
    this.serialNumber = paramString;
  }
  
  public String getFirmwareVersion() {
    return this.firmwareVersion;
  }
  
  public void setFirmwareVersion(String paramString) {
    this.firmwareVersion = paramString;
  }
}
