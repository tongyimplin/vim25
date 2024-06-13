package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm")
@XmlEnum
public enum VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm {
  VM_NPT_INCOMPATIBLE_GUEST("vmNptIncompatibleGuest"),
  VM_NPT_INCOMPATIBLE_GUEST_DRIVER("vmNptIncompatibleGuestDriver"),
  VM_NPT_INCOMPATIBLE_ADAPTER_TYPE("vmNptIncompatibleAdapterType"),
  VM_NPT_DISABLED_OR_DISCONNECTED_ADAPTER("vmNptDisabledOrDisconnectedAdapter"),
  VM_NPT_INCOMPATIBLE_ADAPTER_FEATURES("vmNptIncompatibleAdapterFeatures"),
  VM_NPT_INCOMPATIBLE_BACKING_TYPE("vmNptIncompatibleBackingType"),
  VM_NPT_INSUFFICIENT_MEMORY_RESERVATION("vmNptInsufficientMemoryReservation"),
  VM_NPT_FAULT_TOLERANCE_OR_RECORD_REPLAY_CONFIGURED("vmNptFaultToleranceOrRecordReplayConfigured"),
  VM_NPT_CONFLICTING_IO_CHAIN_CONFIGURED("vmNptConflictingIOChainConfigured"),
  VM_NPT_MONITOR_BLOCKS("vmNptMonitorBlocks"),
  VM_NPT_CONFLICTING_OPERATION_IN_PROGRESS("vmNptConflictingOperationInProgress"),
  VM_NPT_RUNTIME_ERROR("vmNptRuntimeError"),
  VM_NPT_OUT_OF_INTR_VECTOR("vmNptOutOfIntrVector"),
  VM_NPT_VMCI_ACTIVE("vmNptVMCIActive");
  
  private final String value;
  
  VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm fromValue(String paramString) {
    for (VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm virtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm : values()) {
      if (virtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm.value.equals(paramString))
        return virtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeStateVmDirectPathGen2InactiveReasonVm; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
