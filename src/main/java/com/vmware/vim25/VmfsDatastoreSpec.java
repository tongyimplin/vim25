package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VmfsDatastoreCreateSpec;
import com.vmware.vim25.VmfsDatastoreExpandSpec;
import com.vmware.vim25.VmfsDatastoreExtendSpec;
import com.vmware.vim25.VmfsDatastoreSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreSpec", propOrder = {"diskUuid"})
@XmlSeeAlso({VmfsDatastoreCreateSpec.class, VmfsDatastoreExtendSpec.class, VmfsDatastoreExpandSpec.class})
public class VmfsDatastoreSpec extends DynamicData {
  @XmlElement(required = true)
  protected String diskUuid;
  
  public String getDiskUuid() {
    return this.diskUuid;
  }
  
  public void setDiskUuid(String paramString) {
    this.diskUuid = paramString;
  }
}
