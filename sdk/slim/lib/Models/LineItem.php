<?php
/*
 * LineItem
 */
namespace \Models;

/*
 * LineItem
 */
class LineItem {
    /* @var string $iD  */
    private $iD;
/* @var string $productID  */
    private $productID;
/* @var int $quantity  */
    private $quantity;
/* @var Number $unitPrice  */
    private $unitPrice;
/* @var string $costCenter  */
    private $costCenter;
/* @var \DateTime $dateNeeded  */
    private $dateNeeded;
/* @var string $shippingAccount  */
    private $shippingAccount;
/* @var string $shippingAddressID  */
    private $shippingAddressID;
/* @var string $shipfromAddressID  */
    private $shipfromAddressID;
/* @var string $shipperID  */
    private $shipperID;
/* @var \\Models\ShipmentItem[] $specs  */
    private $specs;
/* @var object $xp  */
    private $xp;
}
