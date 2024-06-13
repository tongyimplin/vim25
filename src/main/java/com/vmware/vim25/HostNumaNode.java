package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNumaNode;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNumaNode", propOrder = {"typeId", "cpuID", "memoryRangeBegin", "memoryRangeLength", "pciId"})
public class HostNumaNode extends DynamicData {
  protected byte typeId;
  
  @XmlElement(type = Short.class)
  protected List<Short> cpuID;
  
  protected long memoryRangeBegin;
  
  protected long memoryRangeLength;
  
  protected List<String> pciId;
  
  public byte getTypeId() {
    return this.typeId;
  }
  
  public void setTypeId(byte paramByte) {
    this.typeId = paramByte;
  }
  
  public List<Short> getCpuID() {
    if (this.cpuID == null)
      this.cpuID = new ArrayList<>(); 
    return this.cpuID;
  }
  
  public long getMemoryRangeBegin() {
    return this.memoryRangeBegin;
  }
  
  public void setMemoryRangeBegin(long paramLong) {
    this.memoryRangeBegin = paramLong;
  }
  
  public long getMemoryRangeLength() {
    return this.memoryRangeLength;
  }
  
  public void setMemoryRangeLength(long paramLong) {
    this.memoryRangeLength = paramLong;
  }
  
  public List<String> getPciId() {
    if (this.pciId == null)
      this.pciId = new ArrayList<>(); 
    return this.pciId;
  }
}
