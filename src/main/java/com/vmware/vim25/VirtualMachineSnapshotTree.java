package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachinePowerState;
import com.vmware.vim25.VirtualMachineSnapshotTree;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSnapshotTree", propOrder = {"snapshot", "vm", "name", "description", "id", "createTime", "state", "quiesced", "backupManifest", "childSnapshotList", "replaySupported"})
public class VirtualMachineSnapshotTree extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference snapshot;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String description;
  
  protected Integer id;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar createTime;
  
  @XmlElement(required = true)
  protected VirtualMachinePowerState state;
  
  protected boolean quiesced;
  
  protected String backupManifest;
  
  protected List<VirtualMachineSnapshotTree> childSnapshotList;
  
  protected Boolean replaySupported;
  
  public ManagedObjectReference getSnapshot() {
    return this.snapshot;
  }
  
  public void setSnapshot(ManagedObjectReference paramManagedObjectReference) {
    this.snapshot = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(Integer paramInteger) {
    this.id = paramInteger;
  }
  
  public XMLGregorianCalendar getCreateTime() {
    return this.createTime;
  }
  
  public void setCreateTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.createTime = paramXMLGregorianCalendar;
  }
  
  public VirtualMachinePowerState getState() {
    return this.state;
  }
  
  public void setState(VirtualMachinePowerState paramVirtualMachinePowerState) {
    this.state = paramVirtualMachinePowerState;
  }
  
  public boolean isQuiesced() {
    return this.quiesced;
  }
  
  public void setQuiesced(boolean paramBoolean) {
    this.quiesced = paramBoolean;
  }
  
  public String getBackupManifest() {
    return this.backupManifest;
  }
  
  public void setBackupManifest(String paramString) {
    this.backupManifest = paramString;
  }
  
  public List<VirtualMachineSnapshotTree> getChildSnapshotList() {
    if (this.childSnapshotList == null)
      this.childSnapshotList = new ArrayList<>(); 
    return this.childSnapshotList;
  }
  
  public Boolean isReplaySupported() {
    return this.replaySupported;
  }
  
  public void setReplaySupported(Boolean paramBoolean) {
    this.replaySupported = paramBoolean;
  }
}
