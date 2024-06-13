package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMultipathInfo;
import com.vmware.vim25.HostMultipathInfoLogicalUnit;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMultipathInfo", propOrder = {"lun"})
public class HostMultipathInfo extends DynamicData {
  protected List<HostMultipathInfoLogicalUnit> lun;
  
  public List<HostMultipathInfoLogicalUnit> getLun() {
    if (this.lun == null)
      this.lun = new ArrayList<>(); 
    return this.lun;
  }
}
