package com.vmware.vim25;

import com.vmware.vim25.InvalidState;
import com.vmware.vim25.MksConnectionLimitReached;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MksConnectionLimitReached", propOrder = {"connectionLimit"})
public class MksConnectionLimitReached extends InvalidState {
  protected int connectionLimit;
  
  public int getConnectionLimit() {
    return this.connectionLimit;
  }
  
  public void setConnectionLimit(int paramInt) {
    this.connectionLimit = paramInt;
  }
}
