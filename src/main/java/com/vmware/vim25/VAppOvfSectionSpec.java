package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.VAppOvfSectionInfo;
import com.vmware.vim25.VAppOvfSectionSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppOvfSectionSpec", propOrder = {"info"})
public class VAppOvfSectionSpec extends ArrayUpdateSpec {
  protected VAppOvfSectionInfo info;
  
  public VAppOvfSectionInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(VAppOvfSectionInfo paramVAppOvfSectionInfo) {
    this.info = paramVAppOvfSectionInfo;
  }
}
