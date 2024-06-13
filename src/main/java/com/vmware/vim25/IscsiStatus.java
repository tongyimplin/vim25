package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IscsiStatus;
import com.vmware.vim25.LocalizedMethodFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscsiStatus", propOrder = {"reason"})
public class IscsiStatus extends DynamicData {
  protected List<LocalizedMethodFault> reason;
  
  public List<LocalizedMethodFault> getReason() {
    if (this.reason == null)
      this.reason = new ArrayList<>(); 
    return this.reason;
  }
}
