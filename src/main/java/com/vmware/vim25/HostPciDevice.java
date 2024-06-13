package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPciDevice;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPciDevice", propOrder = {"id", "classId", "bus", "slot", "function", "vendorId", "subVendorId", "vendorName", "deviceId", "subDeviceId", "parentBridge", "deviceName"})
public class HostPciDevice extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  protected short classId;
  
  protected byte bus;
  
  protected byte slot;
  
  protected byte function;
  
  protected short vendorId;
  
  protected short subVendorId;
  
  @XmlElement(required = true)
  protected String vendorName;
  
  protected short deviceId;
  
  protected short subDeviceId;
  
  protected String parentBridge;
  
  @XmlElement(required = true)
  protected String deviceName;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public short getClassId() {
    return this.classId;
  }
  
  public void setClassId(short paramShort) {
    this.classId = paramShort;
  }
  
  public byte getBus() {
    return this.bus;
  }
  
  public void setBus(byte paramByte) {
    this.bus = paramByte;
  }
  
  public byte getSlot() {
    return this.slot;
  }
  
  public void setSlot(byte paramByte) {
    this.slot = paramByte;
  }
  
  public byte getFunction() {
    return this.function;
  }
  
  public void setFunction(byte paramByte) {
    this.function = paramByte;
  }
  
  public short getVendorId() {
    return this.vendorId;
  }
  
  public void setVendorId(short paramShort) {
    this.vendorId = paramShort;
  }
  
  public short getSubVendorId() {
    return this.subVendorId;
  }
  
  public void setSubVendorId(short paramShort) {
    this.subVendorId = paramShort;
  }
  
  public String getVendorName() {
    return this.vendorName;
  }
  
  public void setVendorName(String paramString) {
    this.vendorName = paramString;
  }
  
  public short getDeviceId() {
    return this.deviceId;
  }
  
  public void setDeviceId(short paramShort) {
    this.deviceId = paramShort;
  }
  
  public short getSubDeviceId() {
    return this.subDeviceId;
  }
  
  public void setSubDeviceId(short paramShort) {
    this.subDeviceId = paramShort;
  }
  
  public String getParentBridge() {
    return this.parentBridge;
  }
  
  public void setParentBridge(String paramString) {
    this.parentBridge = paramString;
  }
  
  public String getDeviceName() {
    return this.deviceName;
  }
  
  public void setDeviceName(String paramString) {
    this.deviceName = paramString;
  }
}
