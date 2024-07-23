int axeId = 1359;
// Method for grabbing bird nests
private void grabBirdNests() {
    v.getGroundItem().take(22798); // Bird nest seeds
    v.getGroundItem().take(5074); // Bird nest rings
    v.getGroundItem().take(5072); // Bird nest blue eggs
    v.getGroundItem().take(5070); // Bird nest red eggs?
    v.getGroundItem().take(5071); // Bird nest a green eggs
}

//Method calling or else it will only do them when we are idle, and we will loose bird nest
grabBirdNests();

if (v.getLocalPlayer().hasAnimation(-1)) {
    if (!v.getInventory().hasIn(axeId)) {
        v.getBank().withdraw(axeId, 1);
    } else {
        if (v.getInventory().inventoryFull()) {
            if (!v.getWalking().nearEntity(Entity.GAME, 10528, 2)) {
                v.getWalking().walk(3092, 3243);
            } else {
                v.getBank().depositAll();
            }
        } else {
            v.getWoodcutting().chop(10829, 10833, 10831);
        }
    }
}