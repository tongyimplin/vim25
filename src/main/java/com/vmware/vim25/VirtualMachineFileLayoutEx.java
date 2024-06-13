package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineFileLayoutEx;
import com.vmware.vim25.VirtualMachineFileLayoutExDiskLayout;
import com.vmware.vim25.VirtualMachineFileLayoutExFileInfo;
import com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileLayoutEx", propOrder = {"file", "disk", "snapshot", "timestamp"})
public class VirtualMachineFileLayoutEx extends DynamicData {
  protected List<VirtualMachineFileLayoutExFileInfo> file;
  
  protected List<VirtualMachineFileLayoutExDiskLayout> disk;
  
  protected List<VirtualMachineFileLayoutExSnapshotLayout> snapshot;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar timestamp;
  
  public List<VirtualMachineFileLayoutExFileInfo> getFile() {
    if (this.file == null)
      this.file = new ArrayList<>(); 
    return this.file;
  }
  
  public List<VirtualMachineFileLayoutExDiskLayout> getDisk() {
    if (this.disk == null)
      this.disk = new ArrayList<>(); 
    return this.disk;
  }
  
  public List<VirtualMachineFileLayoutExSnapshotLayout> getSnapshot() {
    if (this.snapshot == null)
      this.snapshot = new ArrayList<>(); 
    return this.snapshot;
  }
  
  public XMLGregorianCalendar getTimestamp() {
    return this.timestamp;
  }
  
  public void setTimestamp(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.timestamp = paramXMLGregorianCalendar;
  }
}
