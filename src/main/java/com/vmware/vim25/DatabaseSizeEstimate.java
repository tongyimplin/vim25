package com.vmware.vim25;

import com.vmware.vim25.DatabaseSizeEstimate;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseSizeEstimate", propOrder = {"size"})
public class DatabaseSizeEstimate extends DynamicData {
  protected long size;
  
  public long getSize() {
    return this.size;
  }
  
  public void setSize(long paramLong) {
    this.size = paramLong;
  }
}
