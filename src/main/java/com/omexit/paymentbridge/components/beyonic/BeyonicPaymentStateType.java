package com.omexit.paymentbridge.components.beyonic;

/**
 * Created by Antony on 3/1/2016.
 */
public enum BeyonicPaymentStateType {
    INVALID_ID(0, "invalid"),
    NEW(1, "new"),
    VALIDATED(2, "validated"),
    APPROVAL_NEEDED(3, "approval_needed"),
    APPROVAL_REQUESTED(4, "approval_requested"),
    APPROVED(5, "approved"),
    REJECTED(6, "rejected"),
    SCHEDULED(7, "scheduled"),
    PROCESSED(8, "processed"),
    PROCESSED_WITH_ERRORS(9, "processed_with_errors"),
    CANCELLED(10, "cancelled");

    private final Integer value;
    private final String code;

    private BeyonicPaymentStateType(final Integer value, final String code) {
        this.value = value;
        this.code = code;
    }

    public static BeyonicPaymentStateType fromInt(final Integer typeValue) {
        BeyonicPaymentStateType enumeration = BeyonicPaymentStateType.INVALID_ID;
        switch (typeValue) {
            case 1:
                enumeration = BeyonicPaymentStateType.NEW;
                break;
            case 2:
                enumeration = BeyonicPaymentStateType.VALIDATED;
                break;
            case 3:
                enumeration = BeyonicPaymentStateType.APPROVAL_NEEDED;
                break;
            case 4:
                enumeration = BeyonicPaymentStateType.APPROVAL_REQUESTED;
                break;
            case 5:
                enumeration = BeyonicPaymentStateType.APPROVED;
                break;
            case 6:
                enumeration = BeyonicPaymentStateType.REJECTED;
                break;
            case 7:
                enumeration = BeyonicPaymentStateType.SCHEDULED;
                break;
            case 8:
                enumeration = BeyonicPaymentStateType.PROCESSED;
                break;
            case 9:
                enumeration = BeyonicPaymentStateType.PROCESSED_WITH_ERRORS;
                break;
            case 10:
                enumeration = BeyonicPaymentStateType.CANCELLED;
                break;
        }

        return enumeration;
    }

    public static BeyonicPaymentStateType fromString(final String typeCode) {
        BeyonicPaymentStateType enumeration = BeyonicPaymentStateType.INVALID_ID;
        switch (typeCode) {
            case "new":
                enumeration = BeyonicPaymentStateType.NEW;
                break;
            case "validated":
                enumeration = BeyonicPaymentStateType.VALIDATED;
                break;
            case "approval_needed":
                enumeration = BeyonicPaymentStateType.APPROVAL_NEEDED;
                break;
            case "approval_requested":
                enumeration = BeyonicPaymentStateType.APPROVAL_REQUESTED;
                break;
            case "approved":
                enumeration = BeyonicPaymentStateType.APPROVED;
                break;
            case "rejected":
                enumeration = BeyonicPaymentStateType.REJECTED;
                break;
            case "scheduled":
                enumeration = BeyonicPaymentStateType.SCHEDULED;
                break;
            case "processed":
                enumeration = BeyonicPaymentStateType.PROCESSED;
                break;
            case "processed_with_errors":
                enumeration = BeyonicPaymentStateType.PROCESSED_WITH_ERRORS;
                break;
            case "cancelled":
                enumeration = BeyonicPaymentStateType.CANCELLED;
                break;
        }

        return enumeration;
    }

    public Integer getValue() {
        return this.value;
    }

    public String getCode() {
        return this.code;
    }
}
