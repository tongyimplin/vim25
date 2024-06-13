package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ImportSpec;
import com.vmware.vim25.OvfConsumerOstNode;
import com.vmware.vim25.VAppEntityConfigInfo;
import com.vmware.vim25.VirtualAppImportSpec;
import com.vmware.vim25.VirtualMachineImportSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportSpec", propOrder = {"entityConfig", "instantiationOst"})
@XmlSeeAlso({VirtualAppImportSpec.class, VirtualMachineImportSpec.class})
public class ImportSpec extends DynamicData {
  protected VAppEntityConfigInfo entityConfig;
  
  protected OvfConsumerOstNode instantiationOst;
  
  public VAppEntityConfigInfo getEntityConfig() {
    return this.entityConfig;
  }
  
  public void setEntityConfig(VAppEntityConfigInfo paramVAppEntityConfigInfo) {
    this.entityConfig = paramVAppEntityConfigInfo;
  }
  
  public OvfConsumerOstNode getInstantiationOst() {
    return this.instantiationOst;
  }
  
  public void setInstantiationOst(OvfConsumerOstNode paramOvfConsumerOstNode) {
    this.instantiationOst = paramOvfConsumerOstNode;
  }
}
