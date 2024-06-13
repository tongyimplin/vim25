package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.VirtualCdromIsoBackingOption;
import com.vmware.vim25.VirtualDeviceBackingOption;
import com.vmware.vim25.VirtualDeviceFileBackingOption;
import com.vmware.vim25.VirtualDiskFlatVer1BackingOption;
import com.vmware.vim25.VirtualDiskFlatVer2BackingOption;
import com.vmware.vim25.VirtualDiskLocalPMemBackingOption;
import com.vmware.vim25.VirtualDiskSeSparseBackingOption;
import com.vmware.vim25.VirtualDiskSparseVer1BackingOption;
import com.vmware.vim25.VirtualDiskSparseVer2BackingOption;
import com.vmware.vim25.VirtualFloppyImageBackingOption;
import com.vmware.vim25.VirtualParallelPortFileBackingOption;
import com.vmware.vim25.VirtualSerialPortFileBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceFileBackingOption", propOrder = {"fileNameExtensions"})
@XmlSeeAlso({VirtualDiskFlatVer2BackingOption.class, VirtualCdromIsoBackingOption.class, VirtualDiskSeSparseBackingOption.class, VirtualParallelPortFileBackingOption.class, VirtualDiskSparseVer2BackingOption.class, VirtualDiskSparseVer1BackingOption.class, VirtualFloppyImageBackingOption.class, VirtualDiskFlatVer1BackingOption.class, VirtualSerialPortFileBackingOption.class, VirtualDiskLocalPMemBackingOption.class})
public class VirtualDeviceFileBackingOption extends VirtualDeviceBackingOption {
  protected ChoiceOption fileNameExtensions;
  
  public ChoiceOption getFileNameExtensions() {
    return this.fileNameExtensions;
  }
  
  public void setFileNameExtensions(ChoiceOption paramChoiceOption) {
    this.fileNameExtensions = paramChoiceOption;
  }
}
