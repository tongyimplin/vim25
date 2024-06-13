package com.vmware.vim25;

import com.vmware.vim25.DiskChangeExtent;
import com.vmware.vim25.DiskChangeInfo;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiskChangeInfo", propOrder = {"startOffset", "length", "changedArea"})
public class DiskChangeInfo extends DynamicData {
  protected long startOffset;
  
  protected long length;
  
  protected List<DiskChangeExtent> changedArea;
  
  public long getStartOffset() {
    return this.startOffset;
  }
  
  public void setStartOffset(long paramLong) {
    this.startOffset = paramLong;
  }
  
  public long getLength() {
    return this.length;
  }
  
  public void setLength(long paramLong) {
    this.length = paramLong;
  }
  
  public List<DiskChangeExtent> getChangedArea() {
    if (this.changedArea == null)
      this.changedArea = new ArrayList<>(); 
    return this.changedArea;
  }
}
