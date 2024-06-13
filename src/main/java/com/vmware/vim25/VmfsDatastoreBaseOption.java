package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskPartitionLayout;
import com.vmware.vim25.VmfsDatastoreBaseOption;
import com.vmware.vim25.VmfsDatastoreMultipleExtentOption;
import com.vmware.vim25.VmfsDatastoreSingleExtentOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreBaseOption", propOrder = {"layout", "partitionFormatChange"})
@XmlSeeAlso({VmfsDatastoreSingleExtentOption.class, VmfsDatastoreMultipleExtentOption.class})
public class VmfsDatastoreBaseOption extends DynamicData {
  @XmlElement(required = true)
  protected HostDiskPartitionLayout layout;
  
  protected Boolean partitionFormatChange;
  
  public HostDiskPartitionLayout getLayout() {
    return this.layout;
  }
  
  public void setLayout(HostDiskPartitionLayout paramHostDiskPartitionLayout) {
    this.layout = paramHostDiskPartitionLayout;
  }
  
  public Boolean isPartitionFormatChange() {
    return this.partitionFormatChange;
  }
  
  public void setPartitionFormatChange(Boolean paramBoolean) {
    this.partitionFormatChange = paramBoolean;
  }
}
