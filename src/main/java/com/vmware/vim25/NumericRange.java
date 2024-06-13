package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NumericRange;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericRange", propOrder = {"start", "end"})
public class NumericRange extends DynamicData {
  protected int start;
  
  protected int end;
  
  public int getStart() {
    return this.start;
  }
  
  public void setStart(int paramInt) {
    this.start = paramInt;
  }
  
  public int getEnd() {
    return this.end;
  }
  
  public void setEnd(int paramInt) {
    this.end = paramInt;
  }
}
