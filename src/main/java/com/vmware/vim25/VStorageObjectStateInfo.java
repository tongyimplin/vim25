package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VStorageObjectStateInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectStateInfo", propOrder = {"tentative"})
public class VStorageObjectStateInfo extends DynamicData {
  protected Boolean tentative;
  
  public Boolean isTentative() {
    return this.tentative;
  }
  
  public void setTentative(Boolean paramBoolean) {
    this.tentative = paramBoolean;
  }
}
