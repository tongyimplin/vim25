package com.vmware.vim25;

import com.vmware.vim25.IntOption;
import com.vmware.vim25.VirtualControllerOption;
import com.vmware.vim25.VirtualPCIControllerOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIControllerOption", propOrder = {"numSCSIControllers", "numEthernetCards", "numVideoCards", "numSoundCards", "numVmiRoms", "numVmciDevices", "numPCIPassthroughDevices", "numSasSCSIControllers", "numVmxnet3EthernetCards", "numParaVirtualSCSIControllers", "numSATAControllers", "numNVMEControllers", "numVmxnet3VrdmaEthernetCards"})
public class VirtualPCIControllerOption extends VirtualControllerOption {
  @XmlElement(required = true)
  protected IntOption numSCSIControllers;
  
  @XmlElement(required = true)
  protected IntOption numEthernetCards;
  
  @XmlElement(required = true)
  protected IntOption numVideoCards;
  
  @XmlElement(required = true)
  protected IntOption numSoundCards;
  
  @XmlElement(required = true)
  protected IntOption numVmiRoms;
  
  protected IntOption numVmciDevices;
  
  protected IntOption numPCIPassthroughDevices;
  
  protected IntOption numSasSCSIControllers;
  
  protected IntOption numVmxnet3EthernetCards;
  
  protected IntOption numParaVirtualSCSIControllers;
  
  protected IntOption numSATAControllers;
  
  protected IntOption numNVMEControllers;
  
  protected IntOption numVmxnet3VrdmaEthernetCards;
  
  public IntOption getNumSCSIControllers() {
    return this.numSCSIControllers;
  }
  
  public void setNumSCSIControllers(IntOption paramIntOption) {
    this.numSCSIControllers = paramIntOption;
  }
  
  public IntOption getNumEthernetCards() {
    return this.numEthernetCards;
  }
  
  public void setNumEthernetCards(IntOption paramIntOption) {
    this.numEthernetCards = paramIntOption;
  }
  
  public IntOption getNumVideoCards() {
    return this.numVideoCards;
  }
  
  public void setNumVideoCards(IntOption paramIntOption) {
    this.numVideoCards = paramIntOption;
  }
  
  public IntOption getNumSoundCards() {
    return this.numSoundCards;
  }
  
  public void setNumSoundCards(IntOption paramIntOption) {
    this.numSoundCards = paramIntOption;
  }
  
  public IntOption getNumVmiRoms() {
    return this.numVmiRoms;
  }
  
  public void setNumVmiRoms(IntOption paramIntOption) {
    this.numVmiRoms = paramIntOption;
  }
  
  public IntOption getNumVmciDevices() {
    return this.numVmciDevices;
  }
  
  public void setNumVmciDevices(IntOption paramIntOption) {
    this.numVmciDevices = paramIntOption;
  }
  
  public IntOption getNumPCIPassthroughDevices() {
    return this.numPCIPassthroughDevices;
  }
  
  public void setNumPCIPassthroughDevices(IntOption paramIntOption) {
    this.numPCIPassthroughDevices = paramIntOption;
  }
  
  public IntOption getNumSasSCSIControllers() {
    return this.numSasSCSIControllers;
  }
  
  public void setNumSasSCSIControllers(IntOption paramIntOption) {
    this.numSasSCSIControllers = paramIntOption;
  }
  
  public IntOption getNumVmxnet3EthernetCards() {
    return this.numVmxnet3EthernetCards;
  }
  
  public void setNumVmxnet3EthernetCards(IntOption paramIntOption) {
    this.numVmxnet3EthernetCards = paramIntOption;
  }
  
  public IntOption getNumParaVirtualSCSIControllers() {
    return this.numParaVirtualSCSIControllers;
  }
  
  public void setNumParaVirtualSCSIControllers(IntOption paramIntOption) {
    this.numParaVirtualSCSIControllers = paramIntOption;
  }
  
  public IntOption getNumSATAControllers() {
    return this.numSATAControllers;
  }
  
  public void setNumSATAControllers(IntOption paramIntOption) {
    this.numSATAControllers = paramIntOption;
  }
  
  public IntOption getNumNVMEControllers() {
    return this.numNVMEControllers;
  }
  
  public void setNumNVMEControllers(IntOption paramIntOption) {
    this.numNVMEControllers = paramIntOption;
  }
  
  public IntOption getNumVmxnet3VrdmaEthernetCards() {
    return this.numVmxnet3VrdmaEthernetCards;
  }
  
  public void setNumVmxnet3VrdmaEthernetCards(IntOption paramIntOption) {
    this.numVmxnet3VrdmaEthernetCards = paramIntOption;
  }
}
